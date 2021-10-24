package com.example.demospringbatch1.config;


import com.example.demospringbatch1.listener.JobCompletionListener;
import com.example.demospringbatch1.step.Processor;
import com.example.demospringbatch1.step.Reader;
import com.example.demospringbatch1.step.Writer;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Bean
	public Job processJob() {
		return jobBuilderFactory.get("processJob")
				.incrementer(new RunIdIncrementer()).listener(listener())
				.flow(orderStep1()).end().build();
	}

	@Bean
	public Step orderStep1() {
		TaskletStep orderStep1 = stepBuilderFactory.get("orderStep1").<String, String>chunk(1)
				.reader(new Reader()).processor(new Processor())
				.writer(new Writer()).build();
		return orderStep1;
	}

	@Bean
	public JobExecutionListener listener() {
		return new JobCompletionListener();
	}

}

package com.dongho98.spring03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring03Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);

		// for문 연습
		String names[] = {"성유고", "김기윤", "김지상", "이경주", "양은지"};

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10 합은" + sum);

		// 배여, 컬렉션을 반복 첫 번째 방법
		for (int i = 0; i < 5; i++) {
			System.out.print(names[i] + " > ");
		}
		System.out.println();

		// 두 번째 방법
		for (String name : names) {
			System.out.println(name);
		}
	}

}

package com.statistics;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;

public class SimpleStatistics {

	public static void main(String[] args) {
		DoubleSummaryStatistics stats= new DoubleSummaryStatistics();
	//	IntSummaryStatistics  stats1= new IntSummaryStatistics();
		//LongSummaryStatistics stats2= new LongSummaryStatistics();
		stats.accept(100.00);
		stats.accept(200.00);
		stats.accept(300.00);
		double sum=stats.getSum();
		double avg=stats.getAverage();
		double max=stats.getMax();
		double min=stats.getMin();
		long cunt=stats.getCount();
		System.out.printf("sum=%.2f", sum);

	}

}

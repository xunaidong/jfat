package cn.jfat.commons.test;

import org.junit.Test;

import cn.jfat.commons.base.Optional;

public class TestNullOptions {
	@Test
	public void testInitNull() {
		Optional<String> so = Optional.of(null);
		System.out.println(so.isPresent());
	}

	@Test
	public void testInitOk() {
		Optional<String> so = Optional.of("String");
		System.out.println(so.isPresent());
	}

	@Test
	public void testOptional() throws Exception {
		Optional<Integer> possible = Optional.of(6);
		Optional<Integer> absentOpt = Optional.absent();
		Optional<Integer> NullableOpt = Optional.fromNullable(null);
		Optional<Integer> NoNullableOpt = Optional.fromNullable(10);
		if (possible.isPresent()) {
			System.out.println("possible isPresent:" + possible.isPresent());
			System.out.println("possible value:" + possible.get());
		}
		if (absentOpt.isPresent()) {
			System.out.println("absentOpt isPresent:" + absentOpt.isPresent());
		}
		if (NullableOpt.isPresent()) {
			System.out.println("fromNullableOpt isPresent:"
					+ NullableOpt.isPresent());
		}
		if (NoNullableOpt.isPresent()) {
			System.out.println("NoNullableOpt isPresent:"
					+ NoNullableOpt.isPresent());
		}
	}
}

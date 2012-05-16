package unittesttest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class Test01Test {

	@Test
	public void testSuccess() throws Exception {
		assertThat(Test01.add(1, 2), is(3));
	}
	
	@Test
	public void testFail() throws Exception {
		assertThat(Test01.sub(1, 2), is(3));
	}

}

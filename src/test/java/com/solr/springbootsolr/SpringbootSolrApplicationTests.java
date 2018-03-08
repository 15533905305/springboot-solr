package com.solr.springbootsolr;

import com.solr.program.bean.TestSolr;
import com.solr.program.dao.TestSolrRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootSolrApplicationTests {

	@Autowired
	TestSolrRepository repository;
	@Test
	public void contextLoads() {
	}
	@Test
	public void testSolrData(){
		TestSolr testSolr = new TestSolr();
		testSolr.setSolrdesc("asdfasd");
		testSolr.setSolrname("AAAAAAAAA");
		testSolr.setSolrNumber("BBBB");
		testSolr.setId("3333");
		repository.save(testSolr);
		System.out.println("success");
	}

	/**
	 * 测试根据Id 查看是否存在 方法
	 */
	@Test
	public void testSolrFind(){
		boolean flag = repository.existsById("3452345234");
		System.out.println("flag = " + flag);
		System.out.println("success");
	}

	/**
	 * 测试根据Id整个对象信息
	 */
	@Test
	public void testSolrFindObj(){
		Optional<TestSolr> testSolr = repository.findById("mmmmmmmm");
		System.out.println("testSolr = " + testSolr);
		System.out.println("success");
	}

	/**
	 * 测试根据Id修改整个对象信息
	 */
	@Test
	public void testSolrUpdateObj(){
		Optional<TestSolr> testSolr = repository.findById("mmmmmmmm");
		//Optional<Optional<TestSolr>> testSolr1 = Optional.ofNullable(testSolr);
		testSolr.get().setSolrNumber("ccccccccc");
		testSolr.get().setSolrname("AAAAAAAAA");
		testSolr.get().setSolrdesc("dfsoooooo");
		repository.save(testSolr.get());
		System.out.println("testSolr = " + Optional.of(testSolr));
		System.out.println("success");
	}

	/**
	 * 测试根据Id 删除 整个对象信息
	 */
	@Test
	public void testSolrDeleteObj(){
		repository.deleteById("3452345234");
		System.out.println("success");
	}

	@Test
	public void testSolrFindAll(){
		List<TestSolr> solrs = repository.findBySolrs();
		solrs.forEach(n-> System.out.println(n.getId()));
	}

	@Test
	public void testSolrFindAll2(){
		List<TestSolr> solrs = repository.findBySolrdescAndSolrname("AAAAAAAAA","asdfasd");
		System.out.println("集合大小 = "+solrs.size());
		solrs.forEach(n-> System.out.println(n.getId()));
	}

}

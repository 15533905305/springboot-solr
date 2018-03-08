package com.solr.program.dao;

import com.solr.program.bean.TestSolr;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by antLuck on 2018/3/8.
 */
@Repository
public interface TestSolrRepository extends SolrCrudRepository<TestSolr,String> {

    @Query(value="*:*")
    List<TestSolr> findBySolrs();

    @Query("solrname:*?0* AND solrdesc:*?1*")
    List<TestSolr> findBySolrdescAndSolrname(String solrName, String solrdesc);
}

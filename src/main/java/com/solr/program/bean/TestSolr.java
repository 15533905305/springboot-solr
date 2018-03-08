package com.solr.program.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * @author wjl
 * @Data 2018, 03, 07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SolrDocument(solrCoreName = "wjl")
public class TestSolr {
    @Id
    private String id;
    @Field
    private String solrname;
    @Field
    private String solrdesc;
    @Field
    private String solrNumber;
}

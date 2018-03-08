package com.solr.program.controller;

import org.springframework.stereotype.Controller;

/**
 * @author wjl
 * @Data 2018, 03, 07
 */
@Controller
public class TestSolrController {
 /*   @Autowired
    private SolrClient solrClient;

    @RequestMapping("/test")
    public String testSolr(){
        SolrInputDocument document = new SolrInputDocument();
        document.setField("id","asdfasdfad");
        document.setField("idasdf","asdfasdfad");
        System.out.println(document);
        try {
            solrClient.add("wjl",document);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("success");
        return "success";
    }*/
}

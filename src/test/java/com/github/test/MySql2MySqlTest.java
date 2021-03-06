package com.github.test;

import com.alibaba.fastjson.JSON;
import com.github.simpledatax.api.DxService;
import com.github.simpledatax.api.adaptor.exception.DxException;
import com.github.simpledatax.api.dto.reader.MySqlReader;
import com.github.simpledatax.api.dto.writer.MySqlWriter;
import com.github.simpledatax.api.dto.DataCollectJob;
import com.github.simpledatax.api.dto.DataCollectResult;

public class MySql2MySqlTest {

    public static void main(String[] args) throws DxException {
        DataCollectJob job = new DataCollectJob();
        job.setJobId(1);
        job.setChannelNum(2);
        MySqlReader reader = new MySqlReader();
        reader.setDbIp("192.168.0.120");
        reader.setDbPort("3306");
        reader.setDbInstanceName("test");
        reader.setSplitPk("COL1");
        reader.setDbUser("root");
        reader.setDbPassword("root");
        reader.setTableName("mysql_load_test");
        reader.setColumnStrs("COL1,COL2,COL3,COL4");
        job.setReader(reader);

        MySqlWriter writer = new MySqlWriter();
        writer.setDbIp("192.168.0.121");
        writer.setDbPort("3306");
        writer.setDbUser("root");
        writer.setDbPassword("root");
        writer.setTableName("mysql_load_test1");
        writer.setColumnStrs("COL1,COL2,COL3,COL4");
        writer.setDbInstanceName("test");
        job.setWriter(writer);
        DxService service = new DxService();
        DataCollectResult result = service.collect(job);
        System.out.println(JSON.toJSONString(result));
    }
}

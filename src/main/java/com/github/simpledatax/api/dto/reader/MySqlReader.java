package com.github.simpledatax.api.dto.reader;

import com.github.simpledatax.api.dto.DataCollectReader;
import com.github.simpledatax.api.dto.DataPluginEnum;

public class MySqlReader implements DataCollectReader {

    private static final long serialVersionUID = 1L;

    /** 数据库实例IP */
    private String dbIp;

    /** 数据库实例端口 */
    private String dbPort;

    /** 数据库实例名 */
    private String dbInstanceName;

    /** 登录用户 */
    private String dbUser;

    /** 登录密码 */
    private String dbPassword;

    /** 接口表名 */
    private String tableName;

    /** 字段串 */
    private String columnStrs;

    /** 过滤脚本 */
    private String sqlWhere;

    /** 定制查询脚本 优先级高于表格 */
    private String sqlScript;

    /** 分片主键 仅当table模式有效，sql脚本无效 */
    private String splitPk;

    public String getDbIp() {
        return dbIp;
    }

    public void setDbIp(String dbIp) {
        this.dbIp = dbIp;
    }

    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public String getDbInstanceName() {
        return dbInstanceName;
    }

    public void setDbInstanceName(String dbInstanceName) {
        this.dbInstanceName = dbInstanceName;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnStrs() {
        return columnStrs;
    }

    public void setColumnStrs(String columnStrs) {
        this.columnStrs = columnStrs;
    }

    public String getSqlWhere() {
        return sqlWhere;
    }

    public void setSqlWhere(String sqlWhere) {
        this.sqlWhere = sqlWhere;
    }

    public String getSqlScript() {
        return sqlScript;
    }

    public void setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
    }

    public String getSplitPk() {
        return splitPk;
    }

    public void setSplitPk(String splitPk) {
        this.splitPk = splitPk;
    }

    @Override
    public DataPluginEnum getPluginName() {
        return DataPluginEnum.MYSQL_READER;
    }

}

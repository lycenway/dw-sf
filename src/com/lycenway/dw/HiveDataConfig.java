package com.lycenway.dw;

public class HiveDataConfig {
	private com.lycenway.dw.HiveDataSource dataSource;

	public com.lycenway.dw.HiveDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(com.lycenway.dw.HiveDataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public static com.lycenway.dw.HiveDataConfig getInstance(java.lang.String dbConfigFilename, java.lang.String dbConnectionName) {
		return null;
		
	}
	
}

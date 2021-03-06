package com.opendroid.db;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class DbConfiguration.
 */
public class DbConfiguration {
	
	static DbConfiguration dbConf;

	/** The table name. */
	final private String databaseName;
	
	final private String databasePath;

	/** The models. */
	final private List<DbModel> models;
	
	
	public String getDatabaseName() {
		return databaseName;
	}
	
	public String getDatabasePath() {
		return databasePath;
	}


	public List<DbModel> getModels() {
		return models;
	}
	
	/**
	 * Instantiates a new db configuration.
	 */
	private DbConfiguration(final Builder builder) {
		this.databaseName = builder.databaseName;
		this.models = builder.models;
		this.databasePath = builder.databasePath;
	}
	
	
	/**
	 * Builder pattern for setting all configurations
	 */
	public static class Builder {
		
		public Builder()
		{
			
		}
		
		/** The table name. */
		private String databaseName;
		
		/** The models. */
		private List<DbModel> models;

		private String databasePath;

		/**
		 * Sets the table name.
		 *
		 * @param tableName the new table name
		 */
		public Builder setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
			return this;
		}
		
		/**
		 * Sets the table name.
		 *
		 * @param tableName the new table name
		 */
		public Builder setDatabasePath(String databasePath) {
			this.databasePath = databasePath;
			return this;
		}

		/**
		 * Sets the models.
		 *
		 * @param models the new models
		 */
		public Builder setModels(List<DbModel> models) {
			this.models = models;
			return this;
		}

		/**
		 * Builds configuration for database and returns object.
		 *
		 * @return the DbConfiguration object for specified configuration
		 */
		public DbConfiguration build() {
			return new DbConfiguration(this);

		}
	}

}

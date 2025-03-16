package com.eyz.TaskBoard;

import com.eyz.TaskBoard.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import static com.eyz.TaskBoard.persistence.config.ConnectionConfig.getConnection;

public class Application {

	public static void main(String[] args) throws SQLException {
		try(var connection = getConnection()){
			new MigrationStrategy(connection).executeMigration();
		}
	}

}

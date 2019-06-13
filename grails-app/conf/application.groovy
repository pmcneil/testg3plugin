hibernate {
    cache {
        queries = false
        use_second_level_cache = false
        use_query_cache = false
    }
}

dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.postgresql.Driver"
    dialect = "org.hibernate.dialect.PostgreSQL94Dialect"
    formatSql = false
    logSql = false
    properties {
        // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
        jmxEnabled = true
        initialSize = 5
        maxActive = 50
        minIdle = 5
        maxIdle = 25
        maxWait = 10000
        maxAge = 10 * 60000
        timeBetweenEvictionRunsMillis = 5000
        minEvictableIdleTimeMillis = 60000
        validationQuery = "SELECT 1"
        validationQueryTimeout = 3
        validationInterval = 15000
        testOnBorrow = true
        testWhileIdle = true
        testOnReturn = false
        jdbcInterceptors = "ConnectionState"
        defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
    }
}

environments {
    development {
        dataSource {
            username = "nsl"
            password = "nsl"
            dbCreate = "create"
            url = "jdbc:postgresql://localhost:5432/testg3"
        }

    }
    test {
        dataSource {
            username = "nsl"
            password = "nsl"
            dbCreate = "create"
            url = "jdbc:postgresql://localhost:5432/testg3"
        }

    }
    production {
        dataSource {
            username = "nsl"
            password = "nsl"
            dbCreate = "none"
            url = "jdbc:postgresql://localhost:5432/testg3"
        }
    }
}
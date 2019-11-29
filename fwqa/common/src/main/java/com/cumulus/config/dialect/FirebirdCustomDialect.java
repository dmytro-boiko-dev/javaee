package com.cumulus.config.dialect;

import org.hibernate.dialect.FirebirdDialect;

/**
 * A simple extension of {@link FirebirdDialect} to make use of Firebird 2.1
 * support for temporary tables.
 *
 * @author Martin Cerny
 */
public class FirebirdCustomDialect extends FirebirdDialect {

    @Override
    public String getSequenceNextValString(String sequenceName) {
        return "select gen_id( " + sequenceName + ", 1 ) from RDB$DATABASE";
    }
}

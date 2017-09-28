// ============================================================================
//
// Copyright (c) 2005-2011, Talend Inc.
//
// Ce code source a été généré automatiquement par _Talend Open Studio for Data Integration
// CodeGenerator version 5.0.1.r74687
// Vous pouvez trouver plus d'informations concernant les produits Talend sur www.talend.com.
// Vous pouvez distribuer ce code sous les termes de la licence GNU LGPL
// http://www.gnu.org/licenses/lgpl.html).
//
// ============================================================================
package routines;

public class Relational {

    /**
     * ISNULL( ) Indicates when a variable is the null value.
     * 
     * {talendTypes} boolean | Boolean
     * 
     * {Category} Relational
     * 
     * {param} Object(null)
     * 
     * {example} ISNULL(null)
     * 
     * 
     */
    public static boolean ISNULL(Object variable) {
        return variable == null;
    }

    /**
     * NOT( ) Returns the complement of the logical value of an expression.
     * 
     * {talendTypes} boolean | Boolean
     * 
     * {Category} Relational
     * 
     * {param} boolean(true)
     * 
     * {example} NOT(false)
     */
    public static boolean NOT(boolean expression) {
        return !expression;
    }
}

package org.sql;

public class FormatSQL {

    public static void main(String[] args) {

        String sql = "SELECT T0.DT dytime, T11.VALUE T11VALUE , T12.VALUE T12VALUE, T21.VALUE T21VALUE, T22.VALUE T22VALUE, T31.VALUE T31VALUE , T32.VALUE T32VALUE, T41.VALUE T41VALUE, T42.VALUE T42VALUE, t11.value DAILYPOWERUNIT1, (t11.value - t12.value) zhcydl1 , t21.value DAILYPOWERUNIT2, (t21.value - t22.value) zhcydl2 , t3.value zjcydl1, t4.value zjcydl2, t31.value DAILYPOWERUNIT3,(t31.value - t32.value) zhcydl3 , t41.value DAILYPOWERUNIT4, (t41.value - t42.value) zhcydl4 , t5.value zjcydl3, t6.value zjcydl4, T13.VALUE xzzjcydl1,T14.VALUE zjcydlxzcs1, T23.VALUE xzzjcydl2,T24.VALUE zjcydlxzcs2, T33.VALUE xzzjcydl3,T34.VALUE zjcydlxzcs3, T43.VALUE xzzjcydl4,T44.VALUE zjcydlxzcs4 FROM (SELECT ? || DECODE(SIGN(LEVEL-9),1,LEVEL||'','0'||LEVEL)||'000000' DT , LEVEL AS DAY FROM DUAL CONNECT BY LEVEL <= TO_CHAR(LAST_DAY(TO_DATE(?,'yyyymm')), 'DD')) T0 LEFT JOIN ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T11 On T11.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T12 On T12.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T13 On T13.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T14 On T14.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T21 On T21.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T22 ON T22.DATA_TIME = T0.DT Left join ги SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T23 On T23.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T24 ON T24.DATA_TIME = T0.DT Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T31 On T31.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T32 On T32.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T33 On T33.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T34 On T34.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T41 On T41.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T42 ON T42.DATA_TIME = T0.DT Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T43 On T43.data_time = T0.dt Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T44 ON T44.DATA_TIME = T0.DT Left join ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T3 ON T3.DATA_TIME = T0.DT LEFT JOIN ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T4 On T4.data_time = T0.dt LEFT JOIN ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T5 ON T5.DATA_TIME = T0.DT LEFT JOIN ( SELECT DATA_TIME, VALUE FROM YT_INDEX_DY_DATA WHERE DEVICE_NAME = ? AND SUBSTR( DATA_TIME,0,6 ) = ? ) T6 On T6.data_time = T0.dt ORDER BY t0.dt ";
        
        String params ="202009(String), 202009(String), E2SONNCOP137(String), 202009(String), E2SONNCOP260(String), 202009(String), E2SONN00P182(String), 202009(String), E2SONN00P183(String), 202009(String), E2SONNCTP139(String), 202009(String), E2SONNCTP264(String), 202009(String), E2SONN00P184(String), 202009(String), E2SONN00P185(String), 202009(String), E2STWOCHP141(String), 202009(String), E2STWOCHP266(String), 202009(String), E2SONN00P186(String), 202009(String), E2SONN00P187(String), 202009(String), E2STWOCUP146(String), 202009(String), E2STWOCUP270(String), 202009(String), E2SONN00P188(String), 202009(String), E2SONN00P189(String), 202009(String), E2SONNCOP312(String), 202009(String), E2SONNCTP262(String), 202009(String), E2STWOCHP267(String), 202009(String), E2STWOCUP271(String), 202009(String)";

        System.out.println();
        formatSQL(sql, params);
        System.out.println();



    }

    public static void formatSQL(String sql, String params) {

        // String a = "201805(String)";
        // String b = a.substring(0, a.indexOf("("));

        String[] paramArr = params.split(",");

        // for (int i = 0; i < paramArr.length; i++) {
        // System.out.print("========== paramArr "+paramArr[i]);
        // System.out.println("========== param "+paramArr[i].substring(0, paramArr[i].indexOf("(")) );
        //
        // }

        String formatSQL = "";
        String[] sqlArr = sql.split("\\?");
        for (int i = 0; i < sqlArr.length - 1; i++) {
             //System.out.print("========== sqlArr "+sqlArr[i]);
             //System.out.println("?");

            String param = paramArr[i].substring(0, paramArr[i].indexOf("("));
            //System.out.println("param====:"+param);
            formatSQL += sqlArr[i];
            formatSQL += "'";
            formatSQL += param.trim();
            formatSQL += "'";
            //System.out.println("555formatSQL====:"+formatSQL);

        }
        formatSQL += sqlArr[sqlArr.length - 1];

        // System.out.println("============== paramArr "+paramArr.length);
        //
        // System.out.println("============== sqlArr "+sqlArr.length);
        //
        System.out.println("==========formatSQL ");
        System.out.println(formatSQL);
        System.out.println();
    }

}

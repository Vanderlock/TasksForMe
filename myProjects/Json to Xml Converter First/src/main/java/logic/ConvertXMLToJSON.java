package logic;


import org.json.*;

public class ConvertXMLToJSON {

    public static String convertXml(String xml){
        String res = null;
        if (xml.startsWith("<")&&xml.length()>2){
            try {
                JSONObject xmlJSONObj = XML.toJSONObject(xml);
                res = xmlJSONObj.toString(4);
            }catch(JSONException e){
                e.printStackTrace();
                res = e.getMessage();
            }
        }else{
            res = "The entered text must start with a '<' character";
        }
        return res;

    }
}

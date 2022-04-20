package API_Configs;
import java.util.HashMap;
public class HeaderConfigs {

    public HashMap defaultHeaders(){
        HashMap defaultHeaders =new HashMap();
        defaultHeaders.put("Content-Type","application/json; charset=utf-8");
     return defaultHeaders;
    }
    //
    public HashMap headersWithToken(){
        HashMap headersWithToken =new HashMap();
        headersWithToken.put("Content-Type","application/json; charset=utf-8");
        //Example of tokens
        headersWithToken.put("Access_Token","sjkjadshaetsjthjsfdsd");
        headersWithToken.put("Jwt_Token","skkskghwthaasddsksdadsavvsatesdopcswjd");
        return headersWithToken;
    }


}

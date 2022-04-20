package API_Builders;

import java.util.HashMap;

public class Post_APi_Builder {

    public HashMap postRequestBody(String id, String title, String author){
        HashMap body =new HashMap();
        body.put("id",id);
        body.put("title",title);
        body.put("author",author);

        return body;
    }
}

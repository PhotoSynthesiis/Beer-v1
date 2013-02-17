package classes.com.example.model;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class AdvisorTagHandler extends SimpleTagSupport {
    private String user;

    public void doTag() throws IOException {
        getJspContext().getOut().write("Hello" + user + "<br>");
        getJspContext().getOut().write("Your advice is : " + getAdvice());
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAdvice() {
        String[] advices = {"That color is not working for you", "Your name sucks", "You are a piece of shit!"};
        int radom = (int) (Math.random() * advices.length);
        return advices[radom];
    }
}

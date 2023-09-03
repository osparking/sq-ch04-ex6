package beans.imple;

import org.springframework.stereotype.Component;

import beans.CommNotiProxy;
import domain.Comment;
import util.UTF_8_Printer;

@Component
public class CommEmailNotiProxy implements CommNotiProxy {

	@Override
	public void notifyComment(Comment comment) {
		UTF_8_Printer.printStream.println("이메일된 코멘트 텍스트: " + comment.getText());
	}

}

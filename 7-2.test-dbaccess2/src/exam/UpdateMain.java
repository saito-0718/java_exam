package exam;

import dao.MemberDao;
import dto.Member;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain {
	public static void main(String[] args) {

		MemberDao dao = new MemberDao();
		Member entity = new Member();
		entity.setId(2);
		entity.setAge(100);
		dao.update(entity);

		System.out.println("update終了");
	}
}

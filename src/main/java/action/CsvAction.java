package action;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CsvFileName;

public class CsvAction implements IAction {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String nextPage = "Error.jsp";

		try {
			//保存先のフォルダ名
			String dir = "csv";

			//ファイル名
			CsvFileName cfn = new CsvFileName();
			String fileName = cfn.getFileName();

			//保存先フォルダの指定
			ServletContext sc = request.getServletContext();
			String p = sc.getRealPath("/" + dir);

            //ファイルを作成
            FileWriter file = new FileWriter(p + "/" + fileName);

            //ファイルに書き込む機能を持ったクラス
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            //ファイルに書き込む
            pw.println("1,山田太郎,yamada@mail.co.jp");
            pw.println("2,佐藤花子,satou@mail.co.jp");
            pw.println("3,鈴木健,suzuki@mail.co.jp");

            //ファイルを閉じる
            pw.close();

            //ファイルのパスをrequestオブジェクトに格納
            request.setAttribute("fileName", dir + "/" + fileName);

            nextPage = "dl.jsp";
        } catch (IOException e) {
            e.printStackTrace();
        }

		return nextPage;
	}

}

package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//CSVファイル名を作成するサンプル
public class CsvFileName {
	public String getFileName() {
		//現在日時取得用のクラス
		Calendar calendar = Calendar.getInstance();

		//書式指定用のクラス
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyyMMddHHmmss");

		//ファイル名の作成
		String csvFileName = sdf.format(calendar.getTime()) + ".csv";

		return csvFileName;
	}
}

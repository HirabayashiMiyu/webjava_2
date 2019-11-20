package jp.co.systena.tigerscave.RPG.application.model;

public abstract class Job {
  public String job;
  public String humanName;
  public String attackName;
  public String character;

  public String getCharacter() {
    return character;
  }

  public void setCharacter(String character) {
    this.character = character;
  }
/*ヒューマンネームをコントローラでとる
  とってきた値をファイトメソッドの引数としてわたして
  リターン値が文字列
  受け取って表示させる*/
  public abstract String fight();
  public abstract String getJobName();
  public String getHumanName() {
    return humanName;
  }
}

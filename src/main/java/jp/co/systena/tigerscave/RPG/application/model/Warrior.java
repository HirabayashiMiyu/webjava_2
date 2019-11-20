package jp.co.systena.tigerscave.RPG.application.model;

public class Warrior extends Job{

  @Override
  public String fight() {
    return humanName + "剣で攻撃した";
  }

  @Override
  public
  String getJobName() {
    // TODO 自動生成されたメソッド・スタブ
    return "戦士";
  }
}

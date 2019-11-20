package jp.co.systena.tigerscave.RPG.application.model;

public class Wizard extends Job{

  @Override
  public String fight() {
    return humanName + "魔法で攻撃した";
  }

  @Override
  public
  String getJobName() {
    // TODO 自動生成されたメソッド・スタブ
    return "魔法使い";
  }
}

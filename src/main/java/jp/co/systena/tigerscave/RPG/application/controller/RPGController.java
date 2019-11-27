package jp.co.systena.tigerscave.RPG.application.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.RPG.application.form.CharacterForm;
import jp.co.systena.tigerscave.RPG.application.model.Job;
import jp.co.systena.tigerscave.RPG.application.model.Warrior;
import jp.co.systena.tigerscave.RPG.application.model.Wizard;

@Controller
public class RPGController {

  @Autowired
  HttpSession session;

  @RequestMapping(value = "/character", method = RequestMethod.GET)
  public ModelAndView index(ModelAndView mav) {
    Map<String, String> characterMap = new HashMap<String, String>();
    characterMap.put("戦士", "戦士");
    characterMap.put("魔法使い", "魔法使い");

    mav.addObject("characters", characterMap);
    mav.addObject("CharacterForm", new CharacterForm());
    mav.setViewName("createCharacter");
    return mav;
  }

  @RequestMapping(value = "/command", method = RequestMethod.GET)
  public ModelAndView index2(ModelAndView mav, CharacterForm characterForm) {
    String name = characterForm.getName();
    String charaJob = characterForm.getCharacter();

    Job job = null;
    // if文
    // インスタンス化してセッションに保存
    // 確認画面にセット
    if ("戦士".equals(charaJob)) {
      job = new Warrior();
    } else if ("魔法使い".equals(charaJob)) {
      job = new Wizard();
    }
    session.setAttribute("job", job);
    session.setAttribute("name", name);

    mav.setViewName("command");
    return mav;
  }

  @RequestMapping(value = "/result", method = RequestMethod.GET)
  public ModelAndView index3(ModelAndView mav, CharacterForm characterForm) {
   Job job = (Job) session.getAttribute("job");

   session.getAttribute("name");

    mav.setViewName("result");
    return mav;
}
}
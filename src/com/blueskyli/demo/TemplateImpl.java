package com.blueskyli.demo;

/**
 * @Description: TODO
 * @author Jack
 * @date 2017年8月7日 下午6:04:01
 */
public class TemplateImpl implements Template
{
    @Override
    public <T> TemoplateResuleVo createTemplate(T t)
    {
        String sms = "您的姓名是{name},年龄{age},性别{sex}";
        String email = "{name}我要发邮件了，我今年{age}岁";
        String wechart = "我要发微信";
        TemoplateResuleVo temoplateResuleVo = new TemoplateResuleVo();
        TemplateVo vo = (TemplateVo) t;
        sms = sms.replace("{name}", vo.getName()).replace("{age}", vo.getAge()).replace("{sex}", vo.getSex());
        email = email.replace("{name}", vo.getName()).replace("{age}", vo.getAge()).replace("{sex}", vo.getSex());
        temoplateResuleVo.setSms(sms);
        temoplateResuleVo.setEmail(email);
        temoplateResuleVo.setWechart(wechart);
        return temoplateResuleVo;
    }
}

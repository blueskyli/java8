package com.blueskyli.demo;

/**
 * @Description: TODO
 * @author Jack
 * @date 2017年8月7日 下午6:20:09
 */
public class Main
{
    
    public static void main(String[] args)
    {
        // Template template = new TemplateImpl();
        // TemplateVo vo = new TemplateVo();
        // {
        // vo.setName("jack");
        // vo.setAge("30");
        // vo.setSex("男");
        // }
        // new Factory().sedMessage(template, vo);
        
        Template template = new TemplateImpl();
        TemplateVo vo = new TemplateVo();
        {
            vo.setName("jack");
            vo.setAge("30");
            vo.setSex("男");
        }
        new Factory().sendMessage((x) -> {
            return template.createTemplate(x);
        }, vo);
        
    }
}

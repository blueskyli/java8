package com.blueskyli.demo;

import java.util.function.Function;

/**
 * @Description: TODO
 * @author Jack
 * @date 2017年8月7日 下午6:07:45
 */
public class Factory
{
    public void sedMessage(Template template, TemplateVo vo)
    {
        TemoplateResuleVo createTemplate = template.createTemplate(vo);
        System.out.println(createTemplate.getSms());
        System.out.println(createTemplate.getEmail());
    }
    
    public void sendMessage(Function<TemplateVo, TemoplateResuleVo> func, TemplateVo vo)
    {
        TemoplateResuleVo createTemplate = func.apply(vo);
        System.out.println(createTemplate.getSms());
        System.out.println(createTemplate.getEmail());
        System.out.println(createTemplate.getWechart());
    }
}

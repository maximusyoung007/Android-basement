package com.example.networktest;

import android.util.Log;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by Administrator on 2018/4/25.
 */

public class ContentHandler extends DefaultHandler {
    private String nodeName;
    private StringBuilder id;
    private StringBuilder name;
    private StringBuilder version;//定义stringbuilder对象
    @Override
    public void startDocument() throws SAXException{//初始化
        id = new StringBuilder();
        name = new StringBuilder();
        version = new StringBuilder();
    }@Override
    //localname记录当前节点的名字
    public void startElement(String uri, String localName, String qName, Attributes attributes)throws SAXException{
        nodeName = localName;
    }
    @Override
    public void characters(char[] ch,int start,int length) throws SAXException{
        if("id".equals(nodeName)){
            id.append(ch,start,length);
        }else if("name".equals(nodeName)){
            name.append(ch,start,length);
        }else if("version".equals(nodeName)){
            version.append(ch,start,length);
        }
    }
    @Override
    public void endElement(String uri,String localName,String qName)throws SAXException{
        if("app".equals(localName)){
            Log.d("ContentHandler","id is " + id.toString().trim());
            Log.d("ContentHandler","name is" + name.toString().trim());
            Log.d("ContentHandler","version is" + version.toString().trim());
            id.setLength(0);
            name.setLength(0);
            version.setLength(0);
        }
    }
    @Override
    public void endDocument() throws SAXException{
        super.endDocument();
    }
}
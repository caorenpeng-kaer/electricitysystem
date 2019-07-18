package cn.com.kaer.electricisystem.payingserver.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Caorenpeng
 * 2019/7/17
 */
public interface IAlipayService {
    String getPayRequest(HttpServletRequest httpServletRequest, HttpServletResponse response) throws ServletException, IOException;
}

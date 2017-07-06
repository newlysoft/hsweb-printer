/*
 *  Copyright (c) 2015.  meicanyun.com Corporation Limited.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of
 *  meicanyun Company. ("Confidential Information").  You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with meicanyun.com.
 */

package org.hsweb.print;

import org.hsweb.printer.dtos.PositionSimplePrintDTO;
import org.hsweb.printer.dtos.PrintResultDTO;
import org.hsweb.printer.utils.PrintUtil;
import org.hsweb.printer.utils.printable.PositionSimplePrintable;
import org.hsweb.printer.utils.printable.positionprint.simple.PositionSimplePrintConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiong on 2017-07-06.
 */
public class PositionSimpleTest {
    public static void main(String[] args) {
        PositionSimplePrintDTO positionSimplePrintDTO=new PositionSimplePrintDTO();
        positionSimplePrintDTO.setType(PositionSimplePrintConstants.TEXT);
        positionSimplePrintDTO.setX("0");
        positionSimplePrintDTO.setY("50");
        positionSimplePrintDTO.setHeight("20");
        positionSimplePrintDTO.setContext("1111111");
        PositionSimplePrintDTO positionSimplePrintDTO2=new PositionSimplePrintDTO();
        positionSimplePrintDTO2.setType(PositionSimplePrintConstants.TEXT);
        positionSimplePrintDTO2.setX("0");
        positionSimplePrintDTO2.setY("150");
        positionSimplePrintDTO2.setHeight("20");
        positionSimplePrintDTO2.setContext("222222");
        PositionSimplePrintDTO positionSimplePrintDTO3=new PositionSimplePrintDTO();
        positionSimplePrintDTO3.setType(PositionSimplePrintConstants.TEXT);
        positionSimplePrintDTO3.setX("0");
        positionSimplePrintDTO3.setY("200");
        positionSimplePrintDTO3.setHeight("20");
        positionSimplePrintDTO3.setContext("3333333");



        List<PositionSimplePrintDTO> positionSimplePrintDTOS=new ArrayList<>();
        positionSimplePrintDTOS.add(positionSimplePrintDTO);
        positionSimplePrintDTOS.add(positionSimplePrintDTO2);
        positionSimplePrintDTOS.add(positionSimplePrintDTO3);
        PositionSimplePrintable positionSimplePrintable=new PositionSimplePrintable("10xx","90","100",positionSimplePrintDTOS);
        PrintResultDTO xxx = PrintUtil.print("xxx", positionSimplePrintable);
        System.out.println(xxx);
    }
}
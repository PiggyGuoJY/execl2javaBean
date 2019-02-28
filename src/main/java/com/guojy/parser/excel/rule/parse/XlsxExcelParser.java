package com.guojy.parser.excel.rule.parse;

import com.guojy.parser.rule.structure.StructureHandler;
import com.guojy.parser.rule.type.AbstractDataTypeTransformerRule;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.nio.file.Path;

/**
 * 程序员（guojy24）很懒，关于这个类，ta什么也没写╮(╯▽╰)╭
 *
 * <p> 创建时间：2018/11/9
 *
 * @author guojy24
 * @version 1.0
 * */
@Slf4j @NoArgsConstructor( access = AccessLevel.PRIVATE)
public class XlsxExcelParser extends ExcelParser {
    public XlsxExcelParser(
            Path path,
            StructureHandler<ExcelParser> structureHandler,
            AbstractDataTypeTransformerRule abstractDataTypeTransformerRule) {
        super(path, structureHandler, abstractDataTypeTransformerRule);
    }
    public XlsxExcelParser(
            File file,
            StructureHandler<ExcelParser> structureHandler,
            AbstractDataTypeTransformerRule abstractDataTypeTransformerRule) {
        super(file, structureHandler, abstractDataTypeTransformerRule);
    }
}
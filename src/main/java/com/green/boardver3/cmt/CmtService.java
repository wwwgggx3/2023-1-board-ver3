package com.green.boardver3.cmt;

import com.green.boardver3.cmt.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmtService {
    private final CmtMapper MAPPER;

    @Autowired
    public CmtService(CmtMapper MAPPER) {
        this.MAPPER = MAPPER;
    }

    int insBoardCmt(CmtEntity entity) {
        try {
            int result = MAPPER.insBoardCmt(entity);

            if (result == 1) {
                return entity.getIboardCmt();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    //w중간에 엔터티로 갈아탄이유? 방금입력된 레코드의 pk값을 얻기 위해 iboardCmt를 담을수있는 공간이 필요했고, 굳이 엔터티를
    //만든 이유는 나중에 jpa 에서 그렇게 하기때문이기도 하고 entity는 테이블과 무조건 동일하게 일대일 매핑되게 들어지는 개체이고
    //iboardCmt, 나중에 우리가 엔터티를 만들거다 왜? 이거보고 나중에 테이블을 만들거다


    public List<CmtVo> selBoardCmt(CmtSelDto dto) {
        int startIdx = (dto.getPage() -1) * dto.getRow();
        dto.setStartIdx(startIdx);
        return MAPPER.selBoardCmt(dto);
    }

    public int delBoardCmt(CmtDelDto dto) {
        return MAPPER.delBoardCmt(dto);
    }
    public int updBoardCmt(CmtEntity entity){
        return MAPPER.updBoardCmt(entity);
    }
}
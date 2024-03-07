package kr.co.ajoo.notice.service;

import java.util.List;

import kr.co.ajoo.notice.domain.ReplyVO;

public interface ReplyService {

	List<ReplyVO> selectReplyList(Integer refNoticeNo);

}

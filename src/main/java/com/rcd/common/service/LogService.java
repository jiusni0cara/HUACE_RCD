package com.rcd.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rcd.common.domain.LogDO;
import com.rcd.common.domain.PageDO;
import com.rcd.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}

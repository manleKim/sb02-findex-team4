package com.sprint.findex.sb02findexteam4.sync.service;

import com.sprint.findex.sb02findexteam4.sync.dto.SyncJobHistoryCreateDto;
import com.sprint.findex.sb02findexteam4.sync.entity.SyncJobHistory;

public interface SyncJobHistoryService {

    SyncJobHistory saveHistory(SyncJobHistoryCreateDto syncJobHistoryCreateDto);

}

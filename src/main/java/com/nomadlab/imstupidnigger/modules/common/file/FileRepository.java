package com.nomadlab.imstupidnigger.modules.common.file;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository extends JpaRepository<File, Long> {
    List<File> findByFileInfoId(Long fileInfo_id);
}

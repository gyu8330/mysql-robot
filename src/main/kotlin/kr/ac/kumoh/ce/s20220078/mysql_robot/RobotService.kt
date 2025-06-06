package kr.ac.kumoh.ce.s20220078.mysql_robot

import org.springframework.stereotype.Service

@Service
class RobotService(val repository: RobotRepository) {

    fun getAllRobots(): List<Robot> {
        return repository.findAll()
    }
}

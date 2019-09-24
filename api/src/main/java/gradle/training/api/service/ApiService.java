package gradle.training.api.service;

import gradle.training.biz.service.BizService;

public class ApiService {

    public static void main(String[] args) {
        BizService bizService = new BizService();
        System.out.println(bizService.helloWorld());
    }
}

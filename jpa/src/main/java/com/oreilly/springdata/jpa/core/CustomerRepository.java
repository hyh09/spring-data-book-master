/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.oreilly.springdata.jpa.core;

import org.springframework.data.repository.Repository;

/**
 * {@link Repository} to access {@link Customer} instances.
 *
 * @author Oliver Gierke
 */
public interface CustomerRepository extends Repository<Customer, Long> {

    /**
     * Returns the {@link Customer} with the given identifier.
     *
     * @param id the id to search for.
     * @return
     */
    Customer findOne(Long id);

    /**
     * Saves the given {@link Customer}.
     *
     * @param customer the {@link Customer} to search for.
     * @return
     */
    Customer save(Customer customer);

    /**
     * Returns the customer with the given {@link EmailAddress}.
     *
     * @param emailAddress the {@link EmailAddress} to search for.
     * @return
     */
    Customer findByEmailAddress(EmailAddress emailAddress);


}

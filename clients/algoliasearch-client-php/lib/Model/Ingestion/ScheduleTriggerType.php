<?php

// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

namespace Algolia\AlgoliaSearch\Model\Ingestion;

/**
 * ScheduleTriggerType Class Doc Comment.
 *
 * @category Class
 *
 * @description A task which is triggered by a schedule (cron expression).
 */
class ScheduleTriggerType
{
    /**
     * Possible values of this enum.
     */
    public const SCHEDULE = 'schedule';

    /**
     * Gets allowable values of the enum.
     *
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::SCHEDULE,
        ];
    }
}

<?php

// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

namespace Algolia\AlgoliaSearch\Model\Ingestion;

/**
 * RunType Class Doc Comment.
 *
 * @category Class
 */
class RunType
{
    /**
     * Possible values of this enum.
     */
    public const REINDEX = 'reindex';

    public const UPDATE = 'update';

    public const DISCOVER = 'discover';

    /**
     * Gets allowable values of the enum.
     *
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::REINDEX,
            self::UPDATE,
            self::DISCOVER,
        ];
    }
}

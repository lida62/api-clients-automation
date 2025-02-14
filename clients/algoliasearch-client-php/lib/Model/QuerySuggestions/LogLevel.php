<?php

// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

namespace Algolia\AlgoliaSearch\Model\QuerySuggestions;

/**
 * LogLevel Class Doc Comment.
 *
 * @category Class
 *
 * @description The type of log entry.   - &#x60;SKIP&#x60;. A query is skipped because it doesn&#39;t match the conditions for successful inclusion. For example, when a query doesn&#39;t generate enough search results. - &#x60;INFO&#x60;. An informative log entry. - &#x60;ERROR&#x60;. The Query Suggestions process encountered an error.
 */
class LogLevel
{
    /**
     * Possible values of this enum.
     */
    public const SKIP = 'SKIP';

    public const INFO = 'INFO';

    public const ERROR = 'ERROR';

    /**
     * Gets allowable values of the enum.
     *
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::SKIP,
            self::INFO,
            self::ERROR,
        ];
    }
}

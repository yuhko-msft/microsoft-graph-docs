---
title: "List windowsInformationProtectionPolicies"
description: "Get a list of the windowsInformationProtectionPolicy objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List windowsInformationProtectionPolicies
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [windowsInformationProtectionPolicy](../resources/windowsinformationprotectionpolicy.md) objects and their properties.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /deviceAppManagement/windowsInformationProtectionPolicies
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [windowsInformationProtectionPolicy](../resources/windowsinformationprotectionpolicy.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_windowsinformationprotectionpolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceAppManagement/windowsInformationProtectionPolicies
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.windowsInformationProtectionPolicy)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.windowsInformationProtectionPolicy",
      "id": "d2652744-2744-d265-4427-65d2442765d2",
      "createdDateTime": "String (timestamp)",
      "description": "String",
      "displayName": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "roleScopeTagIds": [
        "String"
      ],
      "version": "String",
      "azureRightsManagementServicesAllowed": "Boolean",
      "dataRecoveryCertificate": {
        "@odata.type": "microsoft.graph.windowsInformationProtectionDataRecoveryCertificate"
      },
      "enforcementLevel": "String",
      "enterpriseDomain": "String",
      "enterpriseInternalProxyServers": [
        {
          "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
        }
      ],
      "enterpriseIPRanges": [
        {
          "@odata.type": "microsoft.graph.windowsInformationProtectionIPRangeCollection"
        }
      ],
      "enterpriseIPRangesAreAuthoritative": "Boolean",
      "enterpriseNetworkDomainNames": [
        {
          "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
        }
      ],
      "enterpriseProtectedDomainNames": [
        {
          "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
        }
      ],
      "enterpriseProxiedDomains": [
        {
          "@odata.type": "microsoft.graph.windowsInformationProtectionProxiedDomainCollection"
        }
      ],
      "enterpriseProxyServers": [
        {
          "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
        }
      ],
      "enterpriseProxyServersAreAuthoritative": "Boolean",
      "exemptApps": [
        {
          "@odata.type": "microsoft.graph.windowsInformationProtectionDesktopApp"
        }
      ],
      "iconsVisible": "Boolean",
      "indexingEncryptedStoresOrItemsBlocked": "Boolean",
      "isAssigned": "Boolean",
      "neutralDomainResources": [
        {
          "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
        }
      ],
      "protectedApps": [
        {
          "@odata.type": "microsoft.graph.windowsInformationProtectionDesktopApp"
        }
      ],
      "protectionUnderLockConfigRequired": "Boolean",
      "revokeOnUnenrollDisabled": "Boolean",
      "rightsManagementServicesTemplateId": "Guid",
      "smbAutoEncryptedFileExtensions": [
        {
          "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
        }
      ],
      "daysWithoutContactBeforeUnenroll": "Integer",
      "mdmEnrollmentUrl": "String",
      "minutesOfInactivityBeforeDeviceLock": "Integer",
      "numberOfPastPinsRemembered": "Integer",
      "passwordMaximumAttemptCount": "Integer",
      "pinExpirationDays": "Integer",
      "pinLowercaseLetters": "String",
      "pinMinimumLength": "Integer",
      "pinSpecialCharacters": "String",
      "pinUppercaseLetters": "String",
      "revokeOnMdmHandoffDisabled": "Boolean",
      "windowsHelloForBusinessBlocked": "Boolean"
    }
  ]
}
```


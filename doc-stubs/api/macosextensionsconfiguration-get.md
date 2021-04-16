---
title: "Get macOSExtensionsConfiguration"
description: "Read the properties and relationships of a macOSExtensionsConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get macOSExtensionsConfiguration
Namespace: microsoft.graph



Read the properties and relationships of a [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.macOSExtensionsConfiguration not found
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

If successful, this method returns a `200 OK` response code and a [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_macosextensionsconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSExtensionsConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macOSExtensionsConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.macOSExtensionsConfiguration",
    "id": "a9d6979a-979a-a9d6-9a97-d6a99a97d6a9",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "deviceManagementApplicabilityRuleDeviceMode": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
    },
    "deviceManagementApplicabilityRuleOsEdition": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
    },
    "deviceManagementApplicabilityRuleOsVersion": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
    },
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "supportsScopeTags": "Boolean",
    "version": "Integer",
    "kernelExtensionAllowedTeamIdentifiers": [
      "String"
    ],
    "kernelExtensionOverridesAllowed": "Boolean",
    "kernelExtensionsAllowed": [
      {
        "@odata.type": "microsoft.graph.macOSKernelExtension"
      }
    ],
    "systemExtensionsAllowed": [
      {
        "@odata.type": "microsoft.graph.macOSSystemExtension"
      }
    ],
    "systemExtensionsAllowedTeamIdentifiers": [
      "String"
    ],
    "systemExtensionsAllowedTypes": [
      {
        "@odata.type": "microsoft.graph.macOSSystemExtensionTypeMapping"
      }
    ],
    "systemExtensionsBlockOverride": "Boolean"
  }
}
```


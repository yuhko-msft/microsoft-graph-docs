---
title: "Update groupPolicySettingMapping"
description: "Update the properties of a groupPolicySettingMapping object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicySettingMapping
Namespace: microsoft.graph



Update the properties of a [groupPolicySettingMapping](../resources/grouppolicysettingmapping.md) object.

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
PATCH /deviceManagement/groupPolicyMigrationReports/{groupPolicyMigrationReportId}/groupPolicySettingMappings/{groupPolicySettingMappingId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicySettingMapping](../resources/grouppolicysettingmapping.md) object.

The following table shows the properties that are required when you update the [groupPolicySettingMapping](../resources/grouppolicysettingmapping.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|admxSettingDefinitionId|String|Admx Group Policy Id|
|childIdList|String collection|List of Child Ids of the group policy setting.|
|intuneSettingDefinitionId|String|The Intune Setting Definition Id|
|intuneSettingUriList|String collection|The list of Intune Setting URIs this group policy setting maps to|
|isMdmSupported|Boolean|Indicates if the setting is supported by Intune or not|
|mdmCspName|String|The CSP name this group policy setting maps to.|
|mdmMinimumOSVersion|Int32|The minimum OS version this mdm setting supports.|
|mdmSettingUri|String|The MDM CSP URI this group policy setting maps to.|
|mdmSupportedState|mdmSupportedState|Indicates if the setting is supported in Mdm or not. Possible values are: `unknown`, `supported`, `unsupported`, `deprecated`.|
|parentId|String|Parent Id of the group policy setting.|
|settingCategory|String|The category the group policy setting is in.|
|settingDisplayName|String|The display name of this group policy setting.|
|settingDisplayValue|String|The display value of this group policy setting.|
|settingDisplayValueType|String|The display value type of this group policy setting.|
|settingName|String|The name of this group policy setting.|
|settingScope|groupPolicySettingScope|The scope of the setting. Possible values are: `unknown`, `device`, `user`.|
|settingType|groupPolicySettingType|The setting type (security or admx) of the Group Policy. Possible values are: `unknown`, `policy`, `account`, `securityOptions`, `userRightsAssignment`, `auditSetting`, `windowsFirewallSettings`.|
|settingValue|String|The value of this group policy setting.|
|settingValueDisplayUnits|String|The display units of this group policy setting value|
|settingValueType|String|The value type of this group policy setting.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicySettingMapping](../resources/grouppolicysettingmapping.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicysettingmapping"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyMigrationReports/{groupPolicyMigrationReportId}/groupPolicySettingMappings/{groupPolicySettingMappingId}
Content-Type: application/json
Content-length: 754

{
  "@odata.type": "#microsoft.graph.groupPolicySettingMapping",
  "admxSettingDefinitionId": "String",
  "childIdList": [
    "String"
  ],
  "intuneSettingDefinitionId": "String",
  "intuneSettingUriList": [
    "String"
  ],
  "isMdmSupported": "Boolean",
  "mdmCspName": "String",
  "mdmMinimumOSVersion": "Integer",
  "mdmSettingUri": "String",
  "mdmSupportedState": "String",
  "parentId": "String",
  "settingCategory": "String",
  "settingDisplayName": "String",
  "settingDisplayValue": "String",
  "settingDisplayValueType": "String",
  "settingName": "String",
  "settingScope": "String",
  "settingType": "String",
  "settingValue": "String",
  "settingValueDisplayUnits": "String",
  "settingValueType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.groupPolicySettingMapping",
  "id": "dd65080a-080a-dd65-0a08-65dd0a0865dd",
  "admxSettingDefinitionId": "String",
  "childIdList": [
    "String"
  ],
  "intuneSettingDefinitionId": "String",
  "intuneSettingUriList": [
    "String"
  ],
  "isMdmSupported": "Boolean",
  "mdmCspName": "String",
  "mdmMinimumOSVersion": "Integer",
  "mdmSettingUri": "String",
  "mdmSupportedState": "String",
  "parentId": "String",
  "settingCategory": "String",
  "settingDisplayName": "String",
  "settingDisplayValue": "String",
  "settingDisplayValueType": "String",
  "settingName": "String",
  "settingScope": "String",
  "settingType": "String",
  "settingValue": "String",
  "settingValueDisplayUnits": "String",
  "settingValueType": "String"
}
```


---
title: "Add managementTemplateStepVersion"
description: "Add acceptedVersion by posting to the acceptedVersion collection."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: apiPageType
---

# Add managementTemplateStepVersion
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add acceptedVersion by posting to the acceptedVersion collection.

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
POST /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/acceptedVersion/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) object.

You can specify the following properties when creating a **managementTemplateStepVersion**.

|Property|Type|Description|
|:---|:---|:---|
|version|Int32|**TODO: Add Description** Optional.|
|name|String|**TODO: Add Description** Optional.|
|versionInformation|String|**TODO: Add Description** Optional.|
|contentMarkdown|String|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|createdByUserId|String|**TODO: Add Description** Optional.|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastActionByUserId|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `204 No Content` response code and a [managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_managementtemplatestepversion_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/acceptedVersion/$ref
Content-Type: application/json
Content-length: 313

{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStepVersion",
  "version": "Integer",
  "name": "String",
  "versionInformation": "String",
  "contentMarkdown": "String",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedTenants.managementTemplateStepVersion"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStepVersion",
  "id": "a1833f45-63b7-7511-72df-4a2381f63d89",
  "version": "Integer",
  "name": "String",
  "versionInformation": "String",
  "contentMarkdown": "String",
  "createdDateTime": "String (timestamp)",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```


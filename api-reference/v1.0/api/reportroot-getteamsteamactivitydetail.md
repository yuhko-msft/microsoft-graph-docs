---
title: "reportRoot: getTeamsTeamActivityDetail"
description: "Get details about Microsoft Teams activity by team. The numbers include activities for both licensed and non-licensed users."
ms.localizationpriority: medium
ms.prod: "reports"
author: "haoyli"
doc_type: apiPageType
---

# reportRoot: getTeamsTeamActivityDetail

Namespace: microsoft.graph

Get details about Microsoft Teams activity by team. The numbers include activities for both licensed and non-licensed users.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from least to most privileged) |
| :------------------------------------- | :--------------------------------------- |
| Delegated (work or school account)     | Reports.Read.All                         |
| Delegated (personal Microsoft account) | Not supported.                           |
| Application                            | Reports.Read.All                         |

> **Note:** For delegated permissions to allow apps to read service usage reports on behalf of a user, the tenant administrator must have assigned the user the appropriate Azure Active Directory limited administrator role. For more details, see [Authorization for APIs to read Microsoft 365 usage reports](/graph/reportroot-authorization).

## HTTP request

<!-- { "blockType": "ignored" } -->

```http
GET /reports/getTeamsTeamActivityDetail(period='{period_value}')
```

## Function parameters

In the request URL, provide the following parameters with a valid value.

| Parameter | Type   | Description                              |
| :-------- | :----- | :--------------------------------------- |
| period    | string | Specifies the length of time over which the report is aggregated. The supported values for {period_value} are: `D7`, `D30`, `D90`, and `D180`. These values follow the format D*n* where *n* represents the number of days over which the report is aggregated. Required. |
| date      | Date   | Specifies the date for which you would like to view details about activities across one or more teams. {date_value} must have a format of YYYY-MM-DD. As this report is only available for the past 30 days, {date_value} should be a date from that range. |

> **Note:** You need to set either **period** or **date** in the request URL.

## Request headers

| Name          | Description               |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Response

If successful, this method returns a `302 Found` response that redirects to a preauthenticated download URL for the report. That URL can be found in the `Location` header in the response.

Preauthenticated download URLs are only valid for a short period of time (a few minutes) and do not require an `Authorization` header.

The CSV file has the following headers for columns:

- Report Refresh Date
- Team Name
- Team Id
- Team type
- Last Activity Date
- Report Period
- Active users
- Active Channels
- Guests
- Reactions
- Meetings Organized
- Post Messages
- Reply Messages
- Channel Messages
- Urgent Messages
- Mentions
- Active Shared Channels
- Active External Users

## Examples

The following is an example that outputs CSV.

### Request

The following is an example of a request.

<!-- {
  "blockType": "request",
  "name": "reportroot_getteamsuseractivitytotalusercounts_csv"
}-->

```http
GET https://graph.microsoft.com/v1.0/reports/getTeamsTeamActivityDetail(period='D7')
```

### Response

The following is an example of the response.

<!-- { "blockType": "ignored" } --> 

```http
HTTP/1.1 302 Found
Content-Type: text/plain
Location: https://reports.office.com/data/download/JDFKdf2_eJXKS034dbc7e0t__XDe
```

Follow the 302 redirection and the CSV file that downloads will have the following schema.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "stream"
} -->

```http
HTTP/1.1 200 OK
Content-Type: application/octet-stream

Report Refresh Date,Team Name,Team Id,Team Type,Last Activity Date,Report Period,Active Users,Active Channels,Guests,Reactions,Meetings Organized,Post Messages,Reply Messages,Channel Messages,Urgent Messages,Mentions,Active Shared Channels,Active External Users
```

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79 
2015-10-25 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "Example",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
  ]
}-->
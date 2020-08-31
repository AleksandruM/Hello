/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_iterative_factorial.c                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: zmarth <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/19 13:25:49 by zmarth            #+#    #+#             */
/*   Updated: 2020/08/19 22:22:48 by zmarth           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

int	ft_iterative_factorial(int nb)
{
	int i;
	int res;

	i = 1;
	res = 1;
	if (nb >= 12 || nb < 0)
		return (0);
	else if (nb == 0)
		return (1);
	else
	{
		while (i != nb)
		{
			i++;
			res = res * (i + 1);
		}
		return (nb);
	}
}
